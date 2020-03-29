package best.hyun.pgrc.type.dorabys

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Kargon : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kargon)
    override val type: PET_TYPE
        get() = PET_TYPE.DORABYS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kargon)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 55
    override val initLvMaxAtk: Int
        get() = 13
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLvMaxHp: Int
        get() = 1398
    override val maxLvMaxAtk: Int
        get() = 343
    override val maxLvMaxDef: Int
        get() = 220
    override val maxLvMaxSpd: Int
        get() = 203
    override val initLvMinHp: Int
        get() = 42
    override val initLvMinAtk: Int
        get() = 11
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1188
    override val maxLvMinAtk: Int
        get() = 305
    override val maxLvMinDef: Int
        get() = 182
    override val maxLvMinSpd: Int
        get() = 171
    override val minAllGrowth: Double
        get() = 4.608
    override val maxAllGrowth: Double
        get() = 5.315
}
package best.hyun.pgrc.type.kaku

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Bau : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_bau)
    override val type: PET_TYPE
        get() = PET_TYPE.KAKU
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_bau)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.EARTH
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 35
    override val initLvMaxAtk: Int
        get() = 8
    override val initLvMaxDef: Int
        get() = 6
    override val initLvMaxSpd: Int
        get() = 5
    override val maxLvMaxHp: Int
        get() = 1346
    override val maxLvMaxAtk: Int
        get() = 326
    override val maxLvMaxDef: Int
        get() = 229
    override val maxLvMaxSpd: Int
        get() = 221
    override val initLvMinHp: Int
        get() = 27
    override val initLvMinAtk: Int
        get() = 7
    override val initLvMinDef: Int
        get() = 4
    override val initLvMinSpd: Int
        get() = 4
    override val maxLvMinHp: Int
        get() = 1138
    override val maxLvMinAtk: Int
        get() = 289
    override val maxLvMinDef: Int
        get() = 191
    override val maxLvMinSpd: Int
        get() = 190
    override val minAllGrowth: Double
        get() = 4.746
    override val maxAllGrowth: Double
        get() = 5.453
}
package best.hyun.pgrc.type.zyag

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Panji : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_panji)
    override val type: PET_TYPE
        get() = PET_TYPE.ZYAG
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_panji)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
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
        get() = 36
    override val initLvMaxAtk: Int
        get() = 7
    override val initLvMaxDef: Int
        get() = 4
    override val initLvMaxSpd: Int
        get() = 3
    override val maxLvMaxHp: Int
        get() = 1519
    override val maxLvMaxAtk: Int
        get() = 338
    override val maxLvMaxDef: Int
        get() = 205
    override val maxLvMaxSpd: Int
        get() = 159
    override val initLvMinHp: Int
        get() = 28
    override val initLvMinAtk: Int
        get() = 6
    override val initLvMinDef: Int
        get() = 3
    override val initLvMinSpd: Int
        get() = 2
    override val maxLvMinHp: Int
        get() = 1304
    override val maxLvMinAtk: Int
        get() = 299
    override val maxLvMinDef: Int
        get() = 166
    override val maxLvMinSpd: Int
        get() = 127
    override val minAllGrowth: Double
        get() = 4.209
    override val maxAllGrowth: Double
        get() = 4.944
}
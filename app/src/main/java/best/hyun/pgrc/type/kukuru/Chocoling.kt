package best.hyun.pgrc.type.kukuru

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Chocoling : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_chocoling)
    override val type: PET_TYPE
        get() = PET_TYPE.KUKURU
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_chocoling)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 90
    override val subElementalValue: Int
        get() = 10
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 56
    override val initLvMaxAtk: Int
        get() = 12
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 9
    override val maxLvMaxHp: Int
        get() = 1472
    override val maxLvMaxAtk: Int
        get() = 338
    override val maxLvMaxDef: Int
        get() = 215
    override val maxLvMaxSpd: Int
        get() = 237
    override val initLvMinHp: Int
        get() = 43
    override val initLvMinAtk: Int
        get() = 10
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 7
    override val maxLvMinHp: Int
        get() = 1262
    override val maxLvMinAtk: Int
        get() = 300
    override val maxLvMinDef: Int
        get() = 177
    override val maxLvMinSpd: Int
        get() = 206
    override val minAllGrowth: Double
        get() = 4.784
    override val maxAllGrowth: Double
        get() = 5.491
}